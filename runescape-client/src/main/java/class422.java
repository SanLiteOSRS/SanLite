import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class422 extends class425 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -740427323
	)
	static int field4618;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public class422(class425 var1) {
		super(var1); // L: 9
		super.field4627 = "StartSongTask"; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		Iterator var1 = class321.field3474.iterator(); // L: 15

		while (var1.hasNext()) {
			class333 var2 = (class333)var1.next(); // L: 16
			if (var2 != null && !var2.field3596 && var2.field3594 != null) { // L: 18
				try {
					var2.field3594.method6153(); // L: 22
					var2.field3594.setPcmStreamVolume(0); // L: 23
					if (var2.field3593 != null) { // L: 24
						var2.field3594.setMusicTrack(var2.field3593, var2.field3598); // L: 25
					}

					var2.field3593 = null; // L: 27
					var2.field3600 = null; // L: 28
					var2.field3599 = null; // L: 29
					var2.field3596 = true; // L: 30
				} catch (Exception var4) { // L: 32
					class315.RunException_sendStackTrace((String)null, var4); // L: 33
					this.method8017(var4.getMessage()); // L: 34
					return true; // L: 35
				}
			}
		}

		super.field4630 = true; // L: 39
		return true; // L: 40
	}
}
