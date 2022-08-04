import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class437 extends DualNode {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lpy;"
	)
	class433[] field4686;
	@ObfuscatedName("c")
	List field4687;

	@ObfuscatedSignature(
		descriptor = "(Llc;I)V"
	)
	public class437(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method7630(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Llc;II)V"
	)
	public class437(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method7630(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "-15"
	)
	void method7630(Buffer var1) {
		int var2 = var1.method7754(); // L: 31
		this.field4686 = new class433[var2]; // L: 32
		this.field4687 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field4686[var3] = (class433)class271.findEnumerated(class433.method7604(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method7754(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field4686[var3].method7602(var1); // L: 39
				int var7 = var1.method7754(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method7754(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field4687.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "1405494936"
	)
	public List method7633(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field4687.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
