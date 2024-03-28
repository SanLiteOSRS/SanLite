import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iw")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1253528397
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1385365717
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -932918639
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 844200187
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILix;I)Z",
		garbageValue = "173564567"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public static String method4393(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = PacketBufferNode.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("az")
	public static String method4398(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1169641983"
	)
	static int method4399(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4432
			class19.Interpreter_intStackSize -= 2; // L: 4433
			var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4434
			int var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4435
			if (!Client.isCameraLocked) { // L: 4436
				Client.camAngleX = var3; // L: 4437
				Client.camAngleY = var4; // L: 4438
			}

			return 1; // L: 4440
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4442
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4443
			return 1; // L: 4444
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4446
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4447
			return 1; // L: 4448
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4450
			var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4451
			if (var3 < 0) { // L: 4452
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4453
			return 1; // L: 4454
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4456
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4457
			return 1; // L: 4458
		} else {
			return 2; // L: 4460
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1799199799"
	)
	static int method4397(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5160
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.method5750() ? 1 : 0; // L: 5161
			return 1; // L: 5162
		} else {
			return 2; // L: 5164
		}
	}
}
