import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class418 extends class421 {
	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public class418(class421 var1) {
		super(var1); // L: 9
		super.field4572 = "StartSongTask"; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		Iterator var1 = class319.field3433.iterator(); // L: 15

		while (var1.hasNext()) {
			class331 var2 = (class331)var1.next(); // L: 16
			if (var2 != null && !var2.field3545 && var2.field3538 != null) { // L: 18
				try {
					var2.field3538.method5974(); // L: 22
					var2.field3538.setPcmStreamVolume(0); // L: 23
					if (var2.field3548 != null) { // L: 24
						var2.field3538.setMusicTrack(var2.field3548, var2.field3543); // L: 25
					}

					var2.field3548 = null; // L: 27
					var2.field3549 = null; // L: 28
					var2.field3544 = null; // L: 29
					var2.field3545 = true; // L: 30
				} catch (Exception var4) { // L: 32
					class190.RunException_sendStackTrace((String)null, var4); // L: 33
					this.method7773(var4.getMessage()); // L: 34
					return true; // L: 35
				}
			}
		}

		super.field4573 = true; // L: 39
		return true; // L: 40
	}
}
