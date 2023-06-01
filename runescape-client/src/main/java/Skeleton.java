import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1965380539
	)
	static int field2541;
	@ObfuscatedName("he")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1057911863
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 674180287
	)
	@Export("count")
	int count;
	@ObfuscatedName("aj")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ac")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	class226 field2540;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2540 = new class226(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1347818580"
	)
	public int method4467() {
		return this.count; // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lit;",
		garbageValue = "-1399225888"
	)
	public class226 method4471() {
		return this.field2540; // L: 42
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "1546926146"
	)
	static int method4470(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5020
			int var5 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5021
			NPCComposition var6 = class407.getNpcDefinition(var5); // L: 5022
			Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5023
			return 1; // L: 5024
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5026
				class336.Interpreter_intStackSize -= 2; // L: 5027
				var3 = class407.getNpcDefinition(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]); // L: 5028
				int var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 5029
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.method3680(var4); // L: 5030
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.method3682(var4); // L: 5031
				return 1; // L: 5032
			} else if (var0 == 6765) { // L: 5034
				var3 = class407.getNpcDefinition(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 5035
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5036
				return 1; // L: 5037
			} else {
				return 2; // L: 5039
			}
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1505366724"
	)
	static String method4472(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12475
		if (Client.gameBuild == 1) { // L: 12476
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12477
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12478
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12479
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12480
			var0 = "local";
		}

		String var3 = ""; // L: 12481
		if (class406.field4553 != null) { // L: 12482
			var3 = "/p=" + class406.field4553;
		}

		String var4 = "runescape.com"; // L: 12483
		return var2 + var0 + "." + var4 + "/l=" + class124.clientLanguage + "/a=" + ClanChannelMember.field1637 + var3 + "/"; // L: 12484
	}
}
