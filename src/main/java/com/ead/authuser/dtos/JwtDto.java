package com.ead.authuser.dtos;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class JwtDto {

    @NonNull //criar construtor só com token por causa do nonnull
    private String token;
    private String type = "Bearer";

}
