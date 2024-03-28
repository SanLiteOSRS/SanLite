import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -325947393
	)
	@Export("group")
	int group;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1642221491
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	boolean field1076;

	InterfaceParent() {
		this.field1076 = false; // L: 8
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "-1733375835"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 38
		int var1 = Client.localPlayerIndex; // L: 39
		Player var2 = class133.localPlayer = Client.players[var1] = new Player(); // L: 40
		var2.index = var1; // L: 41
		int var3 = var0.readBits(30); // L: 42
		byte var4 = (byte)(var3 >> 28); // L: 43
		int var5 = var3 >> 14 & 16383; // L: 44
		int var6 = var3 & 16383; // L: 45
		var2.pathX[0] = var5 - GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 46
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 47
		var2.pathY[0] = var6 - DevicePcmPlayerProvider.baseY * 64; // L: 48
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 49
		class172.Client_plane = var2.plane = var4; // L: 50
		if (Players.field1395[var1] != null) { // L: 51
			var2.read(Players.field1395[var1]);
		}

		Players.Players_count = 0; // L: 52
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 53
		Players.field1382[var1] = 0; // L: 54
		Players.Players_emptyIdxCount = 0; // L: 55

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 56
			if (var7 != var1) { // L: 57
				int var8 = var0.readBits(18); // L: 58
				int var9 = var8 >> 16; // L: 59
				int var10 = var8 >> 8 & 597; // L: 60
				int var11 = var8 & 597; // L: 61
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 62
				Players.Players_orientations[var7] = 0; // L: 63
				Players.Players_targetIndices[var7] = -1; // L: 64
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 65
				Players.field1382[var7] = 0; // L: 66
			}
		}

		var0.exportIndex(); // L: 68
	} // L: 69
}
