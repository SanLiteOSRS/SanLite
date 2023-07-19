import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class147 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -6978054756855231605L
	)
	long field1664;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1867495395
	)
	int field1662;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	IterableNodeDeque field1663;

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	public class147(Buffer var1) {
		this.field1662 = -1; // L: 9
		this.field1663 = new IterableNodeDeque(); // L: 10
		this.method3231(var1); // L: 28
	} // L: 29

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-469589483"
	)
	void method3231(Buffer var1) {
		this.field1664 = var1.readLong(); // L: 32
		this.field1662 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class166(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class142(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class159(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class151(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class158(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class143(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class148(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class141(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class145(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class162(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class168(this);
			} else if (var2 == 10) {
				var3 = new class154(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class149(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class153(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class163(this);
			}

			((class144)var3).vmethod3458(var1); // L: 53
			this.field1663.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1846663895"
	)
	public void method3232(ClanSettings var1) {
		if (this.field1664 == var1.field1722 && this.field1662 == var1.field1719) { // L: 60
			for (class144 var2 = (class144)this.field1663.last(); var2 != null; var2 = (class144)this.field1663.previous()) { // L: 61
				var2.vmethod3460(var1); // L: 62
			}

			++var1.field1719; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnr;IB)V",
		garbageValue = "-93"
	)
	public static void method3233(AbstractArchive var0, int var1) {
		if (!class305.field3398.isEmpty()) { // L: 163
			ArrayList var2 = new ArrayList(); // L: 166
			Iterator var3 = class305.field3398.iterator(); // L: 167

			while (var3.hasNext()) {
				class317 var4 = (class317)var3.next(); // L: 168
				var4.field3515 = false; // L: 170
				var4.field3514 = false; // L: 171
				var4.field3516 = false; // L: 172
				var4.field3519 = var0; // L: 173
				var4.field3517 = var1; // L: 174
				var4.field3512 = 0.0F; // L: 175
				var2.add(var4); // L: 176
			}

			NPCComposition.method3873(var2, class305.field3401, class305.field3400, class305.field3403, class305.field3402, false); // L: 179
		}
	} // L: 164 180

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5141
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5142
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5143
				int var3 = var2.x >> 7; // L: 5144
				int var4 = var2.y >> 7; // L: 5145
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5146
					if (var2.field1181 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5147
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5148
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5149
					}

					long var5 = ChatChannel.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5151
					var2.playerCycle = Client.cycle; // L: 5152
					class173.scene.drawEntity(BuddyRankComparator.Client_plane, var2.x, var2.y, class291.getTileHeight(var2.field1181 * 64 - 64 + var2.x, var2.field1181 * 64 - 64 + var2.y, BuddyRankComparator.Client_plane), var2.field1181 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5153
				}
			}
		}

	} // L: 5157
}
