package com.github.kevints.jompactor;

import java.util.Objects;
import java.util.concurrent.Executor;

/**
 * Created by kevin on 4/8/14.
 */
public class GoogleProcessClient {
  private final Executor executor;

  GoogleProcessClient(Executor executor) {
    this.executor = Objects.requireNonNull(executor);
  }
}
