import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class408 extends class406 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	AbstractArchive field4520;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	AbstractArchive field4521;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	AbstractArchive field4519;

	@ObfuscatedSignature(
		descriptor = "(Lps;Lnr;Lnr;Lnr;)V"
	)
	public class408(class406 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 15
		this.field4520 = var2; // L: 16
		this.field4521 = var3; // L: 17
		this.field4519 = var4; // L: 18
		super.field4513 = "LoadSongTask"; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		int var2 = 0; // L: 24
		Iterator var3 = class305.field3397.iterator(); // L: 25

		while (true) {
			while (var3.hasNext()) {
				class317 var4 = (class317)var3.next(); // L: 26
				if (var4 != null && var4.field3511.field3434 > 1 && var4.field3511.method5850()) { // L: 28
					this.method7631("Attempted to load patches of already loading midiplayer!"); // L: 29
					return true; // L: 30
				}

				if (var4 != null && !var4.field3514) { // L: 32
					try {
						if (var4.field3519 != null && var4.field3509 != -1 && var4.field3508 != -1) { // L: 37
							if (var4.field3513 == null) { // L: 41
								var4.field3513 = MusicTrack.readTrack(var4.field3519, var4.field3509, var4.field3508); // L: 42
								if (var4.field3513 == null) { // L: 43
									continue;
								}
							}

							if (var4.field3518 == null) { // L: 47
								var4.field3518 = new SoundCache(this.field4519, this.field4521); // L: 48
							}

							if (var4.field3511.method5829(var4.field3513, this.field4520, var4.field3518)) { // L: 50
								++var2; // L: 51
								var4.field3514 = true; // L: 52
								var4.field3511.method5830(); // L: 53
							}
						} else {
							++var2; // L: 38
						}
					} catch (Exception var6) { // L: 56
						var6.printStackTrace(); // L: 57
						this.method7631(var6.getMessage()); // L: 58
						return true; // L: 59
					}
				} else {
					++var2; // L: 33
				}
			}

			if (var2 == class305.field3397.size()) { // L: 63
				return true; // L: 64
			}

			return false; // L: 66
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "16"
	)
	static void method7647(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9957
		int[] var3 = Players.Players_indices; // L: 9958
		boolean var4 = false; // L: 9959
		Username var5 = new Username(var1, ObjectSound.loginType); // L: 9960

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9961
			Player var7 = Client.players[var3[var6]]; // L: 9962
			if (var7 != null && var7 != class27.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9963
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9964
					var8 = class217.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 9966
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9967
					var8.packetBuffer.method9204(0); // L: 9968
					Client.packetWriter.addNode(var8); // L: 9969
				} else if (var0 == 4) { // L: 9971
					var8 = class217.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 9973
					var8.packetBuffer.method9097(var3[var6]); // L: 9974
					var8.packetBuffer.writeByte(0); // L: 9975
					Client.packetWriter.addNode(var8); // L: 9976
				} else if (var0 == 6) { // L: 9978
					var8 = class217.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9980
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9981
					var8.packetBuffer.method9204(0); // L: 9982
					Client.packetWriter.addNode(var8); // L: 9983
				} else if (var0 == 7) { // L: 9985
					var8 = class217.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9987
					var8.packetBuffer.writeShort(var3[var6]); // L: 9988
					var8.packetBuffer.method9088(0); // L: 9989
					Client.packetWriter.addNode(var8); // L: 9990
				}

				var4 = true; // L: 9992
				break;
			}
		}

		if (!var4) { // L: 9996
			ReflectionCheck.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9997
}
