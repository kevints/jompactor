package com.github.kevints.jompactor;

import com.google.common.base.Optional;
import com.google.protobuf.Message;

public interface MessageHandler<T extends Message> {
  public void handle(Optional<PID> from, String name, T message);
}
