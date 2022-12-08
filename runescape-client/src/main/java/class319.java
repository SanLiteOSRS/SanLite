import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class319 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final class319 field3786;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static final class319 field3782;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1826887281
	)
	final int field3783;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1882364867
	)
	final int field3784;

	static {
		field3786 = new class319(51, 27, 800, 0, 16, 16); // L: 29
		field3782 = new class319(25, 28, 800, 656, 40, 40); // L: 30
	}

	class319(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3783 = var5; // L: 39
		this.field3784 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Lch;",
		garbageValue = "-20617"
	)
	static ClientPreferences method6375() {
		AccessFile var0 = null; // L: 117
		ClientPreferences var1 = new ClientPreferences(); // L: 118

		try {
			var0 = class87.getPreferencesFile("", LoginPacket.field3302.name, false); // L: 120
			byte[] var2 = new byte[(int)var0.length()]; // L: 121

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 122 123 126
				var4 = var0.read(var2, var3, var2.length - var3); // L: 124
				if (var4 == -1) {
					throw new IOException(); // L: 125
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 128
		} catch (Exception var6) { // L: 130
		}

		try {
			if (var0 != null) { // L: 132
				var0.close(); // L: 133
			}
		} catch (Exception var5) { // L: 136
		}

		return var1; // L: 137
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1520113956"
	)
	static void method6378() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54
}
