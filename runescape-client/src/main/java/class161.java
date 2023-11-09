import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class161 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -4719885509044374657L
	)
	long field1769;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -353451107849035513L
	)
	long field1766;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	IterableNodeDeque field1771;

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	public class161(Buffer var1) {
		this.field1766 = -1L; // L: 10
		this.field1771 = new IterableNodeDeque(); // L: 11
		this.method3401(var1); // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "51"
	)
	void method3401(Buffer var1) {
		this.field1769 = var1.readLong(); // L: 23
		this.field1766 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class156(this);
			} else if (var2 == 4) {
				var3 = new class167(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class152(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class150(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class157(this);
			}

			((class160)var3).vmethod3451(var1); // L: 34
			this.field1771.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "2102773651"
	)
	public void method3395(ClanChannel var1) {
		if (var1.key == this.field1769 && var1.field1782 == this.field1766) { // L: 41
			for (class160 var2 = (class160)this.field1771.last(); var2 != null; var2 = (class160)this.field1771.previous()) { // L: 42
				var2.vmethod3453(var1); // L: 43
			}

			++var1.field1782; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ldh;ZI)V",
		garbageValue = "1948305446"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5112
			var0.isUnanimated = false; // L: 5113
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 5114 5115
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5117
			int var3 = var0.y >> 7; // L: 5118
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5119
				long var4 = ChatChannel.calculateTag(0, 0, 0, false, var0.index); // L: 5120
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5121
					var0.isUnanimated = false; // L: 5122
					var0.tileHeight = class291.getTileHeight(var0.x, var0.y, BuddyRankComparator.Client_plane); // L: 5123
					var0.playerCycle = Client.cycle; // L: 5124
					class173.scene.addNullableObject(BuddyRankComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5125
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5128
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5129
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5130
					}

					var0.tileHeight = class291.getTileHeight(var0.x, var0.y, BuddyRankComparator.Client_plane); // L: 5132
					var0.playerCycle = Client.cycle; // L: 5133
					class173.scene.drawEntity(BuddyRankComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5134
				}
			}
		}

	} // L: 5138
}
