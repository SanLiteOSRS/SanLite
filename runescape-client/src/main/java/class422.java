import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class422 extends class421 {
	@ObfuscatedName("ac")
	ArrayList field4579;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Ljava/util/ArrayList;)V"
	)
	public class422(class421 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4579 = var2; // L: 10
		super.field4572 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		for (int var1 = 0; var1 < this.field4579.size(); ++var1) { // L: 16
			class421 var2 = (class421)this.field4579.get(var1); // L: 17
			if (var2 == null) { // L: 18
				this.field4579.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod7780()) { // L: 23
				if (var2.method7760()) { // L: 24
					this.method7773(var2.method7763()); // L: 25
					this.field4579.clear(); // L: 26
					return true; // L: 27
				}

				if (var2.method7764() != null) { // L: 30
					this.field4579.add(var2.method7764()); // L: 31
				}

				super.field4573 = var2.field4573; // L: 33
				this.field4579.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4579.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-495331166"
	)
	static final void method7778() {
		Client.field790 = 0; // L: 5856
		int var0 = class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7); // L: 5857
		int var1 = class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7); // L: 5858
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5859
			Client.field790 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5860
			Client.field790 = 1;
		}

		if (Client.field790 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5861
			Client.field790 = 0;
		}

	} // L: 5862
}
