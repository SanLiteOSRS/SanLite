import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class315.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("as")
	public static int method809(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 64
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZIB)V",
		garbageValue = "115"
	)
	public static final void method805(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 45
			PcmPlayer.field295 = var0; // L: 46
			PcmPlayer.PcmPlayer_stereo = var1; // L: 47
			class362.field3960 = var2; // L: 48
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 49

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1560357606"
	)
	static int method808() {
		return Login.loginIndex; // L: 2033
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2146340843"
	)
	static String method810(int var0) {
		if (var0 < 0) { // L: 10298
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 10299 10300
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-2081066520"
	)
	static final boolean method807(Widget var0) {
		int var1 = var0.contentType; // L: 12539
		if (var1 == 205) { // L: 12540
			Client.logoutTimer = 250; // L: 12541
			return true; // L: 12542
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12544
				var2 = (var1 - 300) / 2; // L: 12545
				var3 = var1 & 1; // L: 12546
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12547
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12549
				var2 = (var1 - 314) / 2; // L: 12550
				var3 = var1 & 1; // L: 12551
				Client.playerAppearance.method6471(var2, var3 == 1); // L: 12552
			}

			if (var1 == 324) { // L: 12554
				Client.playerAppearance.method6493(0);
			}

			if (var1 == 325) { // L: 12555
				Client.playerAppearance.method6493(1);
			}

			if (var1 == 326) { // L: 12556
				PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 12558
				Client.playerAppearance.write(var4.packetBuffer); // L: 12559
				Client.packetWriter.addNode(var4); // L: 12560
				return true; // L: 12561
			} else {
				return false; // L: 12563
			}
		}
	}
}
