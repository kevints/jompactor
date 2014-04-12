package com.github.kevints.jompactor;

import com.google.protobuf.Message;

public interface ProcessClient<T extends Message> {
  /**
   * Enqueues a message to be sent, returning immediately.
   *
   * @param from PID sending the message.
   * @param from PID receiving the message.
   * @param message Message to send.
   */
  public void sendAsync(PID from, PID to, T message);
}
