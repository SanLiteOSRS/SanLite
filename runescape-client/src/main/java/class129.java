import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class129 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1557;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1536;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1539;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1538;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1550;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1540;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1541;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1542;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1543;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1544;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1545;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1546;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1547;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1548;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1549;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1535;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static final class129 field1551;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1022777195
	)
	final int field1555;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -389513481
	)
	final int field1553;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -577295575
	)
	final int field1554;

	static {
		field1557 = new class129(0, 0, (String)null, -1, -1); // L: 52
		field1536 = new class129(1, 1, (String)null, 0, 2); // L: 53
		field1539 = new class129(2, 2, (String)null, 1, 2); // L: 54
		field1538 = new class129(3, 3, (String)null, 2, 2); // L: 55
		field1550 = new class129(4, 4, (String)null, 3, 1); // L: 56
		field1540 = new class129(5, 5, (String)null, 4, 1); // L: 57
		field1541 = new class129(6, 6, (String)null, 5, 1); // L: 58
		field1542 = new class129(7, 7, (String)null, 6, 3); // L: 59
		field1543 = new class129(8, 8, (String)null, 7, 3); // L: 60
		field1544 = new class129(9, 9, (String)null, 8, 3); // L: 61
		field1545 = new class129(10, 10, (String)null, 0, 7); // L: 62
		field1546 = new class129(11, 11, (String)null, 1, 7); // L: 63
		field1547 = new class129(12, 12, (String)null, 2, 7); // L: 64
		field1548 = new class129(13, 13, (String)null, 3, 7); // L: 65
		field1549 = new class129(14, 14, (String)null, 4, 7); // L: 66
		field1535 = new class129(15, 15, (String)null, 5, 7); // L: 67
		field1551 = new class129(16, 16, (String)null, 0, 5); // L: 68
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class129(int var1, int var2, String var3, int var4, int var5) {
		this.field1555 = var1; // L: 78
		this.field1553 = var2; // L: 79
		this.field1554 = var4; // L: 80
	} // L: 81

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1553; // L: 84
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	int method3017() {
		return this.field1554; // L: 88
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	static final void method3025() {
		int[] var0 = Players.Players_indices; // L: 3766

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3767
			Player var4 = Client.players[var0[var1]]; // L: 3768
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3769
				--var4.overheadTextCyclesRemaining; // L: 3770
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3771
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3774
			int var2 = Client.npcIndices[var1]; // L: 3775
			NPC var3 = Client.npcs[var2]; // L: 3776
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3777
				--var3.overheadTextCyclesRemaining; // L: 3778
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3779
					var3.overheadText = null;
				}
			}
		}

	} // L: 3782
}
