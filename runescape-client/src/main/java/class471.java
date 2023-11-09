import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public class class471 extends DualNode {
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 2039604875
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lrf;"
	)
	class467[] field4875;
	@ObfuscatedName("an")
	List field4876;

	@ObfuscatedSignature(
		descriptor = "(Lne;I)V"
	)
	public class471(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method8513(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lne;II)V"
	)
	public class471(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method8513(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "2066420776"
	)
	void method8513(Buffer var1) {
		int var2 = var1.method8798(); // L: 31
		this.field4875 = new class467[var2]; // L: 32
		this.field4876 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field4875[var3] = (class467)SpriteMask.findEnumerated(class467.method8480(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method8798(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field4875[var3].method8465(var1); // L: 39
				int var7 = var1.method8798(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method8798(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field4876.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "1213630934"
	)
	public List method8512(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field4876.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
