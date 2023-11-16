import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class420 extends class418 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field4564;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field4561;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	AbstractArchive field4562;

	@ObfuscatedSignature(
		descriptor = "(Lql;Lol;Lol;Lol;)V"
	)
	public class420(class418 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4564 = var2; // L: 17
		this.field4561 = var3; // L: 18
		this.field4562 = var4; // L: 19
		super.field4552 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		int var1 = 0; // L: 25
		Iterator var2 = class316.field3422.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class328 var3 = (class328)var2.next(); // L: 27
				if (var3 != null && var3.field3522.field3455 > 1 && var3.field3522.method6015()) { // L: 29
					this.method7840("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3536) { // L: 33
					try {
						if (var3.field3535 != null && var3.field3523 != -1 && var3.field3531 != -1) { // L: 38
							if (var3.field3534 == null) { // L: 42
								var3.field3534 = MusicTrack.readTrack(var3.field3535, var3.field3523, var3.field3531); // L: 43
								if (var3.field3534 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3533 == null) { // L: 48
								var3.field3533 = new SoundCache(this.field4562, this.field4561); // L: 49
							}

							if (var3.field3522.method6008(var3.field3534, this.field4564, var3.field3533)) { // L: 51
								++var1; // L: 52
								var3.field3536 = true; // L: 53
								var3.field3522.method6009(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method7840(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class316.field3422.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}
}
