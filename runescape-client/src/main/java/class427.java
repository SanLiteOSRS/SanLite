import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class427 extends class425 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field4636;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field4633;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field4635;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Lof;Lof;Lof;)V"
	)
	public class427(class425 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4636 = var2; // L: 17
		this.field4633 = var3; // L: 18
		this.field4635 = var4; // L: 19
		super.field4627 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		int var1 = 0; // L: 25
		Iterator var2 = class321.field3474.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class333 var3 = (class333)var2.next(); // L: 27
				if (var3 != null && var3.field3594.field3518 > 1 && var3.field3594.method6229()) { // L: 29
					this.method8017("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3589) { // L: 33
					try {
						if (var3.field3599 != null && var3.field3590 != -1 && var3.field3591 != -1) { // L: 38
							if (var3.field3593 == null) { // L: 42
								var3.field3593 = MusicTrack.readTrack(var3.field3599, var3.field3590, var3.field3591); // L: 43
								if (var3.field3593 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3600 == null) { // L: 48
								var3.field3600 = new SoundCache(this.field4635, this.field4633); // L: 49
							}

							if (var3.field3594.method6151(var3.field3593, this.field4636, var3.field3600)) { // L: 51
								++var1; // L: 52
								var3.field3589 = true; // L: 53
								var3.field3594.method6152(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						class315.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method8017(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class321.field3474.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}
}
