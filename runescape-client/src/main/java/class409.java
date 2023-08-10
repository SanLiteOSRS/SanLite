import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class409 extends class407 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field4534;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field4535;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field4536;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Lnd;Lnd;Lnd;)V"
	)
	public class409(class407 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 15
		this.field4534 = var2; // L: 16
		this.field4535 = var3; // L: 17
		this.field4536 = var4; // L: 18
		super.field4528 = "LoadSongTask"; // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		int var2 = 0; // L: 24
		Iterator var3 = class306.field3394.iterator(); // L: 25

		while (true) {
			while (var3.hasNext()) {
				class318 var4 = (class318)var3.next(); // L: 26
				if (var4 != null && var4.field3516.field3439 > 1 && var4.field3516.method5926()) { // L: 28
					this.method7653("Attempted to load patches of already loading midiplayer!"); // L: 29
					return true; // L: 30
				}

				if (var4 != null && !var4.field3513) { // L: 32
					try {
						if (var4.field3514 != null && var4.field3507 != -1 && var4.field3509 != -1) { // L: 37
							if (var4.field3518 == null) { // L: 41
								var4.field3518 = MusicTrack.readTrack(var4.field3514, var4.field3507, var4.field3509); // L: 42
								if (var4.field3518 == null) { // L: 43
									continue;
								}
							}

							if (var4.field3517 == null) { // L: 47
								var4.field3517 = new SoundCache(this.field4536, this.field4535); // L: 48
							}

							if (var4.field3516.method5817(var4.field3518, this.field4534, var4.field3517)) { // L: 50
								++var2; // L: 51
								var4.field3513 = true; // L: 52
								var4.field3516.method5840(); // L: 53
							}
						} else {
							++var2; // L: 38
						}
					} catch (Exception var6) { // L: 56
						var6.printStackTrace(); // L: 57
						this.method7653(var6.getMessage()); // L: 58
						return true; // L: 59
					}
				} else {
					++var2; // L: 33
				}
			}

			if (var2 == class306.field3394.size()) { // L: 63
				return true; // L: 64
			}

			return false; // L: 66
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	static void method7680() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 4578
		var0.packetBuffer.writeByte(Huffman.getWindowedMode()); // L: 4579
		var0.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth); // L: 4580
		var0.packetBuffer.writeShort(WorldMapArchiveLoader.canvasHeight); // L: 4581
		Client.packetWriter.addNode(var0); // L: 4582
	} // L: 4583
}
