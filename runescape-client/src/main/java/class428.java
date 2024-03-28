import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class428 extends class426 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field4662;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field4660;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field4661;

	@ObfuscatedSignature(
		descriptor = "(Lqc;Loc;Loc;Loc;)V"
	)
	public class428(class426 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4662 = var2; // L: 17
		this.field4660 = var3; // L: 18
		this.field4661 = var4; // L: 19
		super.field4651 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		int var1 = 0; // L: 25
		Iterator var2 = class321.field3495.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class333 var3 = (class333)var2.next(); // L: 27
				if (var3 != null && var3.field3613.field3534 > 1 && var3.field3613.method6113()) { // L: 29
					this.method7844("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3610) { // L: 33
					try {
						if (var3.field3614 != null && var3.field3605 != -1 && var3.field3606 != -1) { // L: 38
							if (var3.field3616 == null) { // L: 42
								var3.field3616 = MusicTrack.readTrack(var3.field3614, var3.field3605, var3.field3606); // L: 43
								if (var3.field3616 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3615 == null) { // L: 48
								var3.field3615 = new SoundCache(this.field4661, this.field4660); // L: 49
							}

							if (var3.field3613.method6085(var3.field3616, this.field4662, var3.field3615)) { // L: 51
								++var1; // L: 52
								var3.field3610 = true; // L: 53
								var3.field3613.method6002(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						class180.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method7844(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class321.field3495.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}
}
