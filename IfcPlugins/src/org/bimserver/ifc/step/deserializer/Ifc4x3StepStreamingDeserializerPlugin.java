package org.bimserver.ifc.step.deserializer;

import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.deserializers.StreamingDeserializer;

public class Ifc4x3StepStreamingDeserializerPlugin extends IfcStepStreamingDeserializerPlugin {

	@Override
	public StreamingDeserializer createDeserializer(PluginConfiguration pluginConfiguration) {
		return new Ifc4x3StepStreamingDeserializer();
	}

	@Override
	public Set<Schema> getSupportedSchemas() {
		return Schema.asSet(Schema.IFC4X3);
	}
}