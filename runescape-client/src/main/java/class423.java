import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class423 extends class421 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field4583;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field4585;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field4582;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Lom;Lom;Lom;)V"
	)
	public class423(class421 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4583 = var2; // L: 17
		this.field4585 = var3; // L: 18
		this.field4582 = var4; // L: 19
		super.field4572 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		int var1 = 0; // L: 25
		Iterator var2 = class319.field3433.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class331 var3 = (class331)var2.next(); // L: 27
				if (var3 != null && var3.field3538.field3450 > 1 && var3.field3538.method6050()) { // L: 29
					this.method7773("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3547) { // L: 33
					try {
						if (var3.field3544 != null && var3.field3539 != -1 && var3.field3540 != -1) { // L: 38
							if (var3.field3548 == null) { // L: 42
								var3.field3548 = MusicTrack.readTrack(var3.field3544, var3.field3539, var3.field3540); // L: 43
								if (var3.field3548 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3549 == null) { // L: 48
								var3.field3549 = new SoundCache(this.field4582, this.field4585); // L: 49
							}

							if (var3.field3538.method5972(var3.field3548, this.field4583, var3.field3549)) { // L: 51
								++var1; // L: 52
								var3.field3547 = true; // L: 53
								var3.field3538.method5979(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						class190.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method7773(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class319.field3433.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}
}
