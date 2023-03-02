import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lak;"
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
			class121.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2099365505"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 141

		try {
			var0 = UrlRequester.getPreferencesFile("", class134.field1606.name, true); // L: 143
			Buffer var1 = PacketWriter.clientPreferences.toBuffer(); // L: 144
			var0.write(var1.array, 0, var1.offset); // L: 145
		} catch (Exception var3) { // L: 147
		}

		try {
			if (var0 != null) { // L: 149
				var0.closeSync(true); // L: 150
			}
		} catch (Exception var2) { // L: 153
		}

	} // L: 154

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1599179239"
	)
	static void method850() {
		if (Client.oculusOrbState == 1) { // L: 13326
			Client.field595 = true; // L: 13327
		}

	} // L: 13329
}
