import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class167 extends class160 {
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		longValue = 8627223166861386023L
	)
	static long field1823;
	@ObfuscatedName("az")
	String field1824;
	@ObfuscatedName("ah")
	byte field1818;
	@ObfuscatedName("af")
	byte field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class167(class161 var1) {
		this.this$0 = var1; // L: 157
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		this.field1824 = var1.readStringCp1252NullTerminatedOrNull(); // L: 160
		if (this.field1824 != null) { // L: 161
			var1.readUnsignedByte(); // L: 162
			this.field1818 = var1.readByte(); // L: 163
			this.field1819 = var1.readByte(); // L: 164
		}

	} // L: 166

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		var1.name = this.field1824; // L: 169
		if (this.field1824 != null) { // L: 170
			var1.field1801 = this.field1818; // L: 171
			var1.field1799 = this.field1819; // L: 172
		}

	} // L: 174

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-106638788"
	)
	static final void method3417() {
		if (class144.pcmPlayer1 != null) { // L: 3730
			class144.pcmPlayer1.run();
		}

	} // L: 3731

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldi;ZI)V",
		garbageValue = "659881899"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5034
			var0.isUnanimated = false; // L: 5035
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5036 5037
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5039
			int var3 = var0.y >> 7; // L: 5040
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5041
				long var4 = class154.calculateTag(0, 0, 0, false, var0.index); // L: 5042
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5043
					var0.isUnanimated = false; // L: 5044
					var0.tileHeight = Canvas.getTileHeight(var0.x, var0.y, class172.Client_plane); // L: 5045
					var0.playerCycle = Client.cycle; // L: 5046
					LoginType.scene.addNullableObject(class172.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5047
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5050
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5051
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5052
					}

					var0.tileHeight = Canvas.getTileHeight(var0.x, var0.y, class172.Client_plane); // L: 5054
					var0.playerCycle = Client.cycle; // L: 5055
					LoginType.scene.drawEntity(class172.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5056
				}
			}
		}

	} // L: 5060
}
