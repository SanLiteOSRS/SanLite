import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class526 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	class522[] field5171;
	@ObfuscatedName("an")
	List field5170;

	@ObfuscatedSignature(
		descriptor = "(Loc;I)V"
	)
	public class526(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method9162(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Loc;II)V"
	)
	public class526(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method9162(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "63767484"
	)
	void method9162(Buffer var1) {
		int var2 = var1.method9271(); // L: 31
		this.field5171 = new class522[var2]; // L: 32
		this.field5170 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field5171[var3] = (class522)KitDefinition.findEnumerated(class522.method9125(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method9271(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field5171[var3].method9112(var1); // L: 39
				int var7 = var1.method9271(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method9271(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field5170.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "1455037139"
	)
	public List method9164(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field5170.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
