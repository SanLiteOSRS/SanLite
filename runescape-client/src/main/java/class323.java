import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
class class323 implements Callable {
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = 274614777
	)
	static int field3490;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmn;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class323(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3452;

		while (true) {
			class320 var2 = null; // L: 123
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 125
					return null; // L: 126
				}

				var2 = (class320)var1.remove(); // L: 128
			}

			var2.field3474.method1095(); // L: 130
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldo;III)V",
		garbageValue = "1668364198"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 110
		Script var4;
		if (class7.isWorldMapEvent(var0.type)) { // L: 112
			class133.worldMapEvent = (WorldMapEvent)var3[0]; // L: 113
			WorldMapElement var6 = class141.WorldMapElement_get(class133.worldMapEvent.mapElement); // L: 114
			var4 = ModeWhere.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 115
		} else {
			int var5 = (Integer)var3[0]; // L: 118
			var4 = HealthBarUpdate.getScript(var5); // L: 119
		}

		if (var4 != null) { // L: 121
			ApproximateRouteStrategy.method1246(var0, var4, var1, var2); // L: 122
		}

	} // L: 124
}
