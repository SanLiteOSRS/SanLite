import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field511;
	@ObfuscatedName("aw")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13007

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;I)I",
		garbageValue = "1985558289"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13010
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13011
				if (Client.worldId == var1.world) { // L: 13012
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13013
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13015
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13023
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13019
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "150868940"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		UserComparator8.runScript(var0, 500000, 475000); // L: 104
	} // L: 105

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIILhb;II)V",
		garbageValue = "1372641495"
	)
	static void method1250(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 74
		var5.plane = var0; // L: 75
		var5.x = var1 * 16384; // L: 76
		var5.y = var2 * 128; // L: 77
		int var6 = var3.sizeX; // L: 78
		int var7 = var3.sizeY; // L: 79
		if (var4 == 1 || var4 == 3) { // L: 80
			var6 = var3.sizeY; // L: 81
			var7 = var3.sizeX; // L: 82
		}

		var5.maxX = (var6 + var1) * 128; // L: 84
		var5.maxY = (var7 + var2) * 128; // L: 85
		var5.soundEffectId = var3.ambientSoundId; // L: 86
		var5.field851 = var3.int7 * 128; // L: 87
		var5.field854 = var3.int5; // L: 88
		var5.field863 = var3.int6; // L: 89
		var5.soundEffectIds = var3.soundEffectIds; // L: 90
		if (var3.transforms != null) { // L: 91
			var5.obj = var3; // L: 92
			var5.set(); // L: 93
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 95
		if (var5.soundEffectIds != null) { // L: 96
			var5.field857 = var5.field854 + (int)(Math.random() * (double)(var5.field863 - var5.field854));
		}

	} // L: 97

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1850423431"
	)
	public static void method1251() {
		ItemComposition.ItemComposition_cached.clear(); // L: 584
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 585
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 586
	} // L: 587

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "41"
	)
	static int method1249(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5059
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5060
			NPCComposition var6 = Tile.getNpcDefinition(var5); // L: 5061
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5062
			return 1; // L: 5063
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5065
				Interpreter.Interpreter_intStackSize -= 2; // L: 5066
				var3 = Tile.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 5067
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5068
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3713(var4); // L: 5069
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3719(var4); // L: 5070
				return 1; // L: 5071
			} else if (var0 == 6765) { // L: 5073
				var3 = Tile.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 5074
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5075
				return 1; // L: 5076
			} else {
				return 2; // L: 5078
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)Z",
		garbageValue = "1778748581"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11257
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11258
				int var2 = Clock.method3568(var0, var1); // L: 11259
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11260
				if (var0.cs1Comparisons[var1] == 2) { // L: 11261
					if (var2 >= var3) { // L: 11262
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11264
					if (var2 <= var3) { // L: 11265
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11267
					if (var3 == var2) { // L: 11268
						return false;
					}
				} else if (var2 != var3) { // L: 11270
					return false;
				}
			}

			return true; // L: 11272
		}
	}
}
