package io.github.quickmsg.core.http.actors;

import io.github.quickmsg.common.annotation.AllowCors;
import io.github.quickmsg.common.annotation.Header;
import io.github.quickmsg.common.annotation.Router;
import io.github.quickmsg.common.config.Configuration;
import io.github.quickmsg.common.enums.HttpType;
import io.github.quickmsg.common.http.HttpActor;
import io.github.quickmsg.metric.category.CpuMetric;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

/**
 * @author luxurong
 */

@Router(value = "/smqtt/monitor/cpu", type = HttpType.GET)
@Slf4j
@Header(key = "Content-Type", value = "application/json")
@AllowCors
public class CpuHttpActor implements HttpActor {

    @Override
    public Publisher<Void> doRequest(HttpServerRequest request, HttpServerResponse response, Configuration configuration) {
        return request
                .receive()
                .then(response
                        .sendString(Mono.just(CpuMetric.CPU_METRIC_INSTANCE.metrics().toJSONString()))
                        .then());
    }
}
