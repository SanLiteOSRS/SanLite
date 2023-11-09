import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
public class class494 extends DualNode {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lsw;"
	)
	class490[] field4989;
	@ObfuscatedName("ax")
	List field4991;

	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V"
	)
	public class494(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method8802(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lnq;II)V"
	)
	public class494(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method8802(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "1347371252"
	)
	void method8802(Buffer var1) {
		int var2 = var1.method8930(); // L: 31
		this.field4989 = new class490[var2]; // L: 32
		this.field4991 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field4989[var3] = (class490)GameObject.findEnumerated(class490.method8761(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method8930(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field4989[var3].method8758(var1); // L: 39
				int var7 = var1.method8930(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method8930(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field4991.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "2136063107"
	)
	public List method8803(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field4991.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
