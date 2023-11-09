import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class404 extends class407 {
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public class404(class407 var1) {
		super(var1); // L: 8
		super.field4528 = "StartSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		Iterator var2 = class306.field3394.iterator(); // L: 14

		while (var2.hasNext()) {
			class318 var3 = (class318)var2.next(); // L: 15
			if (var3 != null && !var3.field3508 && var3.field3516 != null) { // L: 17
				try {
					var3.field3516.method5819(); // L: 21
					var3.field3516.setPcmStreamVolume(0); // L: 22
					if (var3.field3518 != null) { // L: 23
						var3.field3516.setMusicTrack(var3.field3518, var3.field3512); // L: 24
					}

					var3.field3518 = null; // L: 26
					var3.field3517 = null; // L: 27
					var3.field3514 = null; // L: 28
					var3.field3508 = true; // L: 29
				} catch (Exception var5) { // L: 31
					var5.printStackTrace(); // L: 32
					this.method7653(var5.getMessage()); // L: 33
					return true; // L: 34
				}
			}
		}

		super.field4526 = true; // L: 38
		return true; // L: 39
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "108"
	)
	public static void method7637(AbstractArchive var0) {
		class506.field5043 = var0; // L: 19
	} // L: 20
}
