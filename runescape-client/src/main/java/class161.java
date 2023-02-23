import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class161 extends class139 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -805291803
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("c")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -2054717824716221371L
	)
	long field1803;
	@ObfuscatedName("w")
	String field1804;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class161(class142 var1) {
		this.this$0 = var1;
		this.field1803 = -1L; // L: 194
		this.field1804 = null; // L: 195
	} // L: 197

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1803 = var1.readLong(); // L: 202
		}

		this.field1804 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.method3233(this.field1803, this.field1804); // L: 208
	} // L: 209

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lfb;",
		garbageValue = "411794772"
	)
	public static Clock method3385() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-517296328"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 436
		int var2 = var1.readUnsignedByte(); // L: 437
		int var3 = var1.readInt(); // L: 438
		if (var3 < 0 || AbstractArchive.field4222 != 0 && var3 > AbstractArchive.field4222) { // L: 439
			throw new RuntimeException(); // L: 440
		} else if (var2 == 0) { // L: 442
			byte[] var6 = new byte[var3]; // L: 443
			var1.readBytes(var6, 0, var3); // L: 444
			return var6; // L: 445
		} else {
			int var4 = var1.readInt(); // L: 448
			if (var4 >= 0 && (AbstractArchive.field4222 == 0 || var4 <= AbstractArchive.field4222)) { // L: 449
				byte[] var5 = new byte[var4]; // L: 452
				if (var2 == 1) { // L: 453
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 454
				}

				return var5; // L: 455
			} else {
				throw new RuntimeException(); // L: 450
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1583789821"
	)
	static final void method3384() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 5115 5116 5133
			if (var0.plane == class103.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 5117
				if (Client.cycle >= var0.cycleStart) { // L: 5118
					if (var0.targetIndex > 0) { // L: 5119
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 5120
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 5121
							var0.setDestination(var1.x, var1.y, GrandExchangeOfferNameComparator.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 5123
						int var2 = -var0.targetIndex - 1; // L: 5125
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 5126
							var3 = class387.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 5127
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, GrandExchangeOfferNameComparator.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 5128
						}
					}

					var0.advance(Client.field574); // L: 5130
					WorldMapAreaData.scene.drawEntity(class103.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 5131
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5135
}
