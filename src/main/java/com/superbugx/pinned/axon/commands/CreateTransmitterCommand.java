package com.superbugx.pinned.axon.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class CreateTransmitterCommand {
	// Attributes
	@TargetAggregateIdentifier
	private final String transmitterId;
}