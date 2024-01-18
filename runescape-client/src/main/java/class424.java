import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class424 extends class422 {
	@ObfuscatedName("hz")
	static String field4605;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field4604;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field4602;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field4601;

	@ObfuscatedSignature(
		descriptor = "(Lqd;Low;Low;Low;)V"
	)
	public class424(class422 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4604 = var2; // L: 17
		this.field4602 = var3; // L: 18
		this.field4601 = var4; // L: 19
		super.field4597 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		int var1 = 0; // L: 25
		Iterator var2 = class319.field3459.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class331 var3 = (class331)var2.next(); // L: 27
				if (var3 != null && var3.field3582.field3499 > 1 && var3.field3582.method6079()) { // L: 29
					this.method7954("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3575) { // L: 33
					try {
						if (var3.field3572 != null && var3.field3573 != -1 && var3.field3574 != -1) { // L: 38
							if (var3.field3584 == null) { // L: 42
								var3.field3584 = MusicTrack.readTrack(var3.field3572, var3.field3573, var3.field3574); // L: 43
								if (var3.field3584 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3583 == null) { // L: 48
								var3.field3583 = new SoundCache(this.field4601, this.field4602); // L: 49
							}

							if (var3.field3582.method6072(var3.field3584, this.field4604, var3.field3583)) { // L: 51
								++var1; // L: 52
								var3.field3575 = true; // L: 53
								var3.field3582.method6073(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						class368.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method7954(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class319.field3459.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}
}
