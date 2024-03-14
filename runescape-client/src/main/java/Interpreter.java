import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ar")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("as")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aa")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("az")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1754226121
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("au")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 880258881
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1049741979
	)
	static int field884;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("at")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ae")
	static boolean field893;
	@ObfuscatedName("ac")
	static boolean field894;
	@ObfuscatedName("ab")
	static ArrayList field895;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1475534203
	)
	static int field896;
	@ObfuscatedName("bd")
	static final double field890;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 74
		Interpreter_arrays = new int[5][5000]; // L: 75
		Interpreter_intStack = new int[1000]; // L: 76
		Interpreter_stringStack = new String[1000]; // L: 78
		Interpreter_frameDepth = 0; // L: 80
		Interpreter_frames = new ScriptFrame[50]; // L: 81
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 87
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 90
		field893 = false; // L: 93
		field894 = false; // L: 94
		field895 = new ArrayList(); // L: 95
		field896 = 0; // L: 96
		field890 = Math.log(2.0D); // L: 100
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1463854705"
	)
	static IndexedSprite method2107() {
		IndexedSprite var0 = new IndexedSprite(); // L: 132
		var0.width = class548.SpriteBuffer_spriteWidth; // L: 133
		var0.height = class548.SpriteBuffer_spriteHeight; // L: 134
		var0.xOffset = class548.SpriteBuffer_xOffsets[0]; // L: 135
		var0.yOffset = class548.SpriteBuffer_yOffsets[0]; // L: 136
		var0.subWidth = class235.SpriteBuffer_spriteWidths[0]; // L: 137
		var0.subHeight = class548.SpriteBuffer_spriteHeights[0]; // L: 138
		var0.palette = AbstractSocket.SpriteBuffer_spritePalette; // L: 139
		var0.pixels = class548.SpriteBuffer_pixels[0]; // L: 140
		class548.SpriteBuffer_xOffsets = null; // L: 142
		class548.SpriteBuffer_yOffsets = null; // L: 143
		class235.SpriteBuffer_spriteWidths = null; // L: 144
		class548.SpriteBuffer_spriteHeights = null; // L: 145
		AbstractSocket.SpriteBuffer_spritePalette = null;
		class548.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lof;IS)V",
		garbageValue = "10274"
	)
	public static void method2056(AbstractArchive var0, int var1) {
		if (!class321.field3484.isEmpty()) { // L: 146
			ArrayList var2 = new ArrayList(); // L: 149
			Iterator var3 = class321.field3484.iterator(); // L: 150

			while (var3.hasNext()) {
				class333 var4 = (class333)var3.next(); // L: 151
				var4.field3596 = false; // L: 153
				var4.field3589 = false; // L: 154
				var4.field3597 = false; // L: 155
				var4.field3595 = false; // L: 156
				var4.field3599 = var0; // L: 157
				var4.field3592 = var1; // L: 158
				var4.field3602 = 0.0F; // L: 159
				var2.add(var4); // L: 160
			}

			PacketWriter.method2891(var2, class321.field3483, class321.field3476, class321.field3485, class321.field3486, false); // L: 163
		}
	} // L: 147 164

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-129271426"
	)
	static void method2106(int var0) {
		if (var0 != Client.gameState) { // L: 1333
			if (Client.gameState == 30) { // L: 1334
				Client.field737.method4394(); // L: 1335
			}

			if (Client.gameState == 0) { // L: 1337
				class193.client.method571();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1338
				class407.method7638(class67.field519); // L: 1339
				Client.field559 = 0; // L: 1340
				Client.field560 = 0; // L: 1341
				Client.timer.method8108(var0); // L: 1342
				if (var0 != 20) { // L: 1343
					ScriptEvent.method2361(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class324.field3539 != null) { // L: 1345 1346
				class324.field3539.close(); // L: 1347
				class324.field3539 = null; // L: 1348
			}

			if (Client.gameState == 25) { // L: 1351
				Client.field598 = 0; // L: 1352
				Client.field594 = 0; // L: 1353
				Client.field666 = 1; // L: 1354
				Client.field621 = 0; // L: 1355
				Client.field597 = 1; // L: 1356
			}

			if (var0 != 5 && var0 != 10) { // L: 1358
				if (var0 == 20) { // L: 1366
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1367
					class344.method6458(ScriptFrame.field468, class311.field3274, false, var3); // L: 1368
				} else if (var0 == 11) { // L: 1370
					class344.method6458(ScriptFrame.field468, class311.field3274, false, 4); // L: 1371
				} else if (var0 == 50) { // L: 1373
					class114.setLoginResponseString("", "Updating date of birth...", ""); // L: 1374
					class344.method6458(ScriptFrame.field468, class311.field3274, false, 7); // L: 1375
				} else if (var0 != 0) { // L: 1377
					WorldMapDecoration.method5034(); // L: 1378
				}
			} else {
				boolean var1 = class30.clientPreferences.method2539() >= Client.field688; // L: 1361
				int var2 = var1 ? 0 : 12; // L: 1363
				class344.method6458(ScriptFrame.field468, class311.field3274, true, var2); // L: 1364
			}

			Client.gameState = var0; // L: 1380
		}
	} // L: 1381
}
