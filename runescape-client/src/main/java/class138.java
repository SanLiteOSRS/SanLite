import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class138 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -35347907
	)
	int field1598;
	@ObfuscatedName("h")
	String field1595;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1598 = var1.readInt(); // L: 326
		this.field1595 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2966(this.field1598, this.field1595); // L: 331
	} // L: 332

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "5"
	)
	static int method2896(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4559
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4560
			return 1; // L: 4561
		} else if (var0 == 6950) { // L: 4563
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4564
			return 1; // L: 4565
		} else {
			return 2; // L: 4567
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1297035772"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12131
		short[] var2 = new short[16]; // L: 12132
		int var3 = 0; // L: 12133

		for (int var4 = 0; var4 < class144.ItemComposition_fileCount; ++var4) { // L: 12134
			ItemComposition var9 = AttackOption.ItemComposition_get(var4); // L: 12135
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12136 12137 12138
				if (var3 >= 250) { // L: 12139
					ScriptEvent.foundItemIdCount = -1; // L: 12140
					class271.foundItemIds = null; // L: 12141
					return; // L: 12142
				}

				if (var3 >= var2.length) { // L: 12144
					short[] var6 = new short[var2.length * 2]; // L: 12145

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12146
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12147
				}

				var2[var3++] = (short)var4; // L: 12149
			}
		}

		class271.foundItemIds = var2; // L: 12151
		class286.foundItemIndex = 0; // L: 12152
		ScriptEvent.foundItemIdCount = var3; // L: 12153
		String[] var8 = new String[ScriptEvent.foundItemIdCount]; // L: 12154

		for (int var5 = 0; var5 < ScriptEvent.foundItemIdCount; ++var5) { // L: 12155
			var8[var5] = AttackOption.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = class271.foundItemIds; // L: 12156
		class132.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12158
	} // L: 12160
}
