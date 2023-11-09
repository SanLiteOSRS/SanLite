import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("aj")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "118"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-25"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)V",
		garbageValue = "1115242547"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = BuddyRankComparator.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - GameEngine.baseX * 64; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - class178.baseY * 64; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		TaskHandler.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1335[var1] != null) { // L: 50
			var2.read(Players.field1335[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1336[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1336[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68
}
