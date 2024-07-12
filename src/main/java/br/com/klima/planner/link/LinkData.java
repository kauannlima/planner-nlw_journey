package br.com.klima.planner.link;

import java.util.UUID;

public record LinkData(
        UUID id,
        String title,
        String url
) {
}
