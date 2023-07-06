import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("co")
	@Export("otp")
	static String otp;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) {
			class260.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIB)V",
		garbageValue = "99"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 107
		Script var4;
		if (TileItem.isWorldMapEvent(var0.type)) { // L: 109
			class183.worldMapEvent = (WorldMapEvent)var3[0]; // L: 110
			WorldMapElement var6 = class147.WorldMapElement_get(class183.worldMapEvent.mapElement); // L: 111
			var4 = class412.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 112
		} else {
			int var5 = (Integer)var3[0]; // L: 115
			var4 = class190.getScript(var5); // L: 116
		}

		if (var4 != null) { // L: 118
			class125.method2919(var0, var4, var1, var2); // L: 119
		}

	} // L: 121

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-838943376"
	)
	static void method815(float[] var0) {
		var0[1] = 1.0F - var0[1]; // L: 344
		if (var0[0] < 0.0F) { // L: 345
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) { // L: 346
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) { // L: 347
			float var1 = (float)(1.0D + ((double)var0[1] - 2.0D) * (double)var0[1] + (double)(var0[0] * (var0[0] - 2.0F + var0[1]))); // L: 348
			if (var1 + class125.field1463 > 0.0F) { // L: 349
				World.method1753(var0); // L: 350
			}
		}

		var0[1] = 1.0F - var0[1]; // L: 353
	} // L: 354

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldq;",
		garbageValue = "-910083542"
	)
	static class90[] method817() {
		return new class90[]{class90.field1090, class90.field1096, class90.field1091, class90.field1094, class90.field1093, class90.field1092}; // L: 17
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIZI)V",
		garbageValue = "170850099"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11087
		int var5 = var0.height; // L: 11088
		if (var0.widthAlignment == 0) { // L: 11089
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11090
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11091
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11092
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11093
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11094
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11095
			var0.width = var0.field3619 * var0.height / var0.field3620;
		}

		if (var0.heightAlignment == 4) { // L: 11096
			var0.height = var0.field3620 * var0.width / var0.field3619;
		}

		if (var0.contentType == 1337) { // L: 11097
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11098
			var0.method6380().method6061(var0.width, var0.height); // L: 11099
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11101
			ScriptEvent var6 = new ScriptEvent(); // L: 11102
			var6.widget = var0; // L: 11103
			var6.args = var0.onResize; // L: 11104
			Client.scriptEvents.addFirst(var6); // L: 11105
		}

	} // L: 11107
}
