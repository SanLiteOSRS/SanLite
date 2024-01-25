import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class419 extends class422 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public class419(class422 var1) {
		super(var1); // L: 9
		super.field4597 = "StartSongTask"; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		Iterator var1 = class319.field3459.iterator(); // L: 15

		while (var1.hasNext()) {
			class331 var2 = (class331)var1.next(); // L: 16
			if (var2 != null && !var2.field3579 && var2.field3582 != null) { // L: 18
				try {
					var2.field3582.removeAll(); // L: 22
					var2.field3582.setPcmStreamVolume(0); // L: 23
					if (var2.field3584 != null) { // L: 24
						var2.field3582.setMusicTrack(var2.field3584, var2.field3578); // L: 25
					}

					var2.field3584 = null; // L: 27
					var2.field3583 = null; // L: 28
					var2.field3572 = null; // L: 29
					var2.field3579 = true; // L: 30
				} catch (Exception var4) { // L: 32
					class368.RunException_sendStackTrace((String)null, var4); // L: 33
					this.method7954(var4.getMessage()); // L: 34
					return true; // L: 35
				}
			}
		}

		super.field4594 = true; // L: 39
		return true; // L: 40
	}
}
