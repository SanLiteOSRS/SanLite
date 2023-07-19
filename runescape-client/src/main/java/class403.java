import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class403 extends class406 {
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 665162231
	)
	static int field4504;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	public class403(class406 var1) {
		super(var1); // L: 8
		super.field4513 = "StartSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		Iterator var2 = class305.field3397.iterator(); // L: 14

		while (var2.hasNext()) {
			class317 var3 = (class317)var2.next(); // L: 15
			if (var3 != null && !var3.field3515 && var3.field3511 != null) { // L: 17
				try {
					var3.field3511.removeAll(); // L: 21
					var3.field3511.setPcmStreamVolume(0); // L: 22
					if (var3.field3513 != null) { // L: 23
						var3.field3511.setMusicTrack(var3.field3513, var3.field3510); // L: 24
					}

					var3.field3513 = null; // L: 26
					var3.field3518 = null; // L: 27
					var3.field3519 = null; // L: 28
					var3.field3515 = true; // L: 29
				} catch (Exception var5) { // L: 31
					var5.printStackTrace(); // L: 32
					this.method7631(var5.getMessage()); // L: 33
					return true; // L: 34
				}
			}
		}

		super.field4515 = true; // L: 38
		return true; // L: 39
	}
}
