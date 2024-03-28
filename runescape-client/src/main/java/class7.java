import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class7 {
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("az")
	ExecutorService field20;
	@ObfuscatedName("ah")
	Future field22;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final Buffer field19;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class3 field18;

	@ObfuscatedSignature(
		descriptor = "(Lur;Lat;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field20 = Executors.newSingleThreadExecutor(); // L: 10
		this.field19 = var1; // L: 16
		this.field18 = var2; // L: 17
		this.method48(); // L: 18
	} // L: 19

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-17070"
	)
	public boolean method46() {
		return this.field22.isDone(); // L: 22
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18832"
	)
	public void method59() {
		this.field20.shutdown(); // L: 26
		this.field20 = null; // L: 27
	} // L: 28

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Lur;",
		garbageValue = "-10"
	)
	public Buffer method58() {
		try {
			return (Buffer)this.field22.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	void method48() {
		this.field22 = this.field20.submit(new class1(this, this.field19, this.field18)); // L: 40
	} // L: 41

	@ObfuscatedName("ah")
	public static int method60(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 48
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "266384949"
	)
	static void method44() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 297
			if (NPC.clientPreferences.method2547() != null) { // L: 298
				Login.Login_username = NPC.clientPreferences.method2547(); // L: 299
				Client.Login_isUsernameRemembered = true; // L: 300
			} else {
				Client.Login_isUsernameRemembered = false; // L: 302
			}

		}
	} // L: 303
}
