import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class74 {
	@ObfuscatedName("at")
	static final BigInteger field913;
	@ObfuscatedName("an")
	static final BigInteger field907;
	@ObfuscatedName("ax")
	static short[][][] field916;
	@ObfuscatedName("jb")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1236759399
	)
	static int field911;

	static {
		field913 = new BigInteger("10001", 16); // L: 6
		field907 = new BigInteger("abc31bb2d0938536c5db9c13d63acd8be013bf03a8adf82d7eeb74ff76295fb695114405ad7451023ca93bc605bd48d9844d94694682157a8f969b9b34f5bb294f650532f4aca8734ffac3d71b389af10d8d4372811a5cedd4b4427a45d02bcc2d901ea30db7fcbd372ca0bf00e52aa3a185d0d23a2320d72e180157ad3b1d8b", 16); // L: 7
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "-1520578315"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		UrlRequest.method2839(var0); // L: 74

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 76
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 77
			Player var5 = Client.players[var4]; // L: 78
			int var6 = var0.readUnsignedByte(); // L: 79
			if ((var6 & 8) != 0) { // L: 80
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 512) != 0) {
				var6 += var0.readUnsignedByte() << 16; // L: 81
			}

			class137.method3090(var0, var4, var5, var6); // L: 82
		}

		if (var0.offset - var2 != var1) { // L: 85
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 86
		}
	} // L: 88

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-272656609"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
