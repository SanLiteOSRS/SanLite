import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class457 extends DualNode {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	class453[] field4844;
	@ObfuscatedName("h")
	List field4843;

	@ObfuscatedSignature(
		descriptor = "(Llg;I)V"
	)
	public class457(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method8295(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Llg;II)V"
	)
	public class457(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method8295(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1188919420"
	)
	void method8295(Buffer var1) {
		int var2 = var1.method8424(); // L: 31
		this.field4844 = new class453[var2]; // L: 32
		this.field4843 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field4844[var3] = (class453)DecorativeObject.findEnumerated(class453.method8268(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method8424(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field4844[var3].method8257(var1); // L: 39
				int var7 = var1.method8424(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method8424(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field4843.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "-1080330405"
	)
	public List method8301(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field4843.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1990168635"
	)
	static int method8304(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}
}
