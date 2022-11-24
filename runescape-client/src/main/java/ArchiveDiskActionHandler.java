import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1199311371
	)
	static int field4122;
	@ObfuscatedName("x")
	@Export("ArchiveDiskActionHandler_lock")
	static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("h")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4122 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 76
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 77
				} // L: 78

				if (var1 != null) { // L: 79
					if (var1.type == 0) { // L: 80
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 81
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 82
							var1.remove(); // L: 83
						} // L: 84
					} else if (var1.type == 1) { // L: 86
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 87
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 88
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 89
						} // L: 90
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 92
						if (field4122 <= 1) { // L: 93
							field4122 = 0; // L: 94
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 95
							return; // L: 96
						}

						field4122 = 600; // L: 98
					}
				} else {
					class197.method3946(100L); // L: 102
					synchronized(ArchiveDiskActionHandler_lock) { // L: 103
						if (field4122 <= 1) { // L: 104
							field4122 = 0; // L: 105
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 106
							return; // L: 107
						}

						--field4122; // L: 109
					}
				}
			}
		} catch (Exception var13) {
			class421.RunException_sendStackTrace((String)null, var13); // L: 115
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2029749129"
	)
	public static int method6293(int var0) {
		return var0 >>> 4 & class459.field4854; // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Les;",
		garbageValue = "13"
	)
	static class130 method6280(int var0) {
		class130[] var1 = new class130[]{class130.field1552, class130.field1551, class130.field1547, class130.field1545, class130.field1546, class130.field1549, class130.field1550, class130.field1548, class130.field1553}; // L: 114
		class130 var2 = (class130)DecorativeObject.findEnumerated(var1, var0); // L: 116
		if (var2 == null) { // L: 117
			var2 = class130.field1553;
		}

		return var2; // L: 118
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-59706697"
	)
	public static void method6291() {
		ParamComposition.ParamComposition_cached.clear(); // L: 72
	} // L: 73

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IIII)V",
		garbageValue = "-1574294658"
	)
	static void method6292(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && BufferedSink.clientPreferences.method2411() != 0) { // L: 3816
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3817
				class101.method2567(var0.soundEffects[var1], var2, var3); // L: 3818
			}
		}
	} // L: 3819
}
