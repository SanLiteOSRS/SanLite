import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
class class408 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class407 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	class408(class407 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "1421575480"
	)
	int method7679(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method7679((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	static final void method7686() {
		ApproximateRouteStrategy.method1186(UserComparator8.field1415, DecorativeObject.field2828, Clock.field1883); // L: 3927
		InvDefinition.method3561(Clock.field1884, class53.field368); // L: 3928
		if (UserComparator8.field1415 == class208.cameraX && DecorativeObject.field2828 == class152.cameraY && Clock.field1883 == ByteArrayPool.cameraZ && Clock.field1884 == MusicPatchNode.cameraPitch && class53.field368 == class291.cameraYaw) { // L: 3929
			Client.field691 = false; // L: 3930
			Client.isCameraLocked = false; // L: 3931
			Client.field764 = false; // L: 3932
			Client.field725 = false; // L: 3933
			HealthBarUpdate.field1233 = 0; // L: 3934
			class137.field1605 = 0; // L: 3935
			HitSplatDefinition.field2142 = 0; // L: 3936
			BufferedSource.field4636 = 0; // L: 3937
			class209.field2322 = 0; // L: 3938
			LoginScreenAnimation.field1255 = 0; // L: 3939
			UserComparator4.field1410 = 0; // L: 3940
			class126.field1469 = 0; // L: 3941
			class217.field2401 = 0; // L: 3942
			class85.field1044 = 0; // L: 3943
			Client.field540 = null; // L: 3944
			Client.field769 = null; // L: 3945
			Client.field768 = null; // L: 3946
		}

	} // L: 3948
}
