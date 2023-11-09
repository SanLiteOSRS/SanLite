import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class403 extends class406 {
	@ObfuscatedName("ae")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	public class403(class406 var1) {
		super(var1); // L: 9
		super.field4523 = "StartSongTask"; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		Iterator var1 = class305.field3404.iterator(); // L: 15

		while (var1.hasNext()) {
			class317 var2 = (class317)var1.next(); // L: 16
			if (var2 != null && !var2.field3518 && var2.field3517 != null) { // L: 18
				try {
					var2.field3517.method5783(); // L: 22
					var2.field3517.setPcmStreamVolume(0); // L: 23
					if (var2.field3522 != null) { // L: 24
						var2.field3517.setMusicTrack(var2.field3522, var2.field3515); // L: 25
					}

					var2.field3522 = null; // L: 27
					var2.field3521 = null; // L: 28
					var2.field3514 = null; // L: 29
					var2.field3518 = true; // L: 30
				} catch (Exception var4) { // L: 32
					Messages.RunException_sendStackTrace((String)null, var4); // L: 33
					this.method7601(var4.getMessage()); // L: 34
					return true; // L: 35
				}
			}
		}

		super.field4525 = true; // L: 39
		return true; // L: 40
	}
}
