import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class369 extends class340 implements class216 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	final AbstractArchive field4119;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	final DemotingHashTable field4118;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 640434103
	)
	final int field4117;

	@ObfuscatedSignature(
		descriptor = "(Ljd;ILkk;Ljv;)V"
	)
	public class369(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4118 = new DemotingHashTable(64);
		this.field4119 = var4;
		this.field4117 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lml;",
		garbageValue = "1996028065"
	)
	protected class342 vmethod6434(int var1) {
		synchronized(this.field4118) {
			class341 var2 = (class341)this.field4118.get((long)var1);
			if (var2 == null) {
				var2 = this.method6432(var1);
				this.field4118.method4290(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Lmq;",
		garbageValue = "1323866848"
	)
	class341 method6432(int var1) {
		byte[] var2 = this.field4119.takeFile(this.field4117, var1);
		class341 var3 = new class341(var1);
		if (var2 != null) {
			var3.method6035(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-174176415"
	)
	public void method6433() {
		synchronized(this.field4118) {
			this.field4118.clear();
		}
	}

	public Iterator iterator() {
		return new class368(this);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljava/lang/String;Ljava/lang/String;B)[Loh;",
		garbageValue = "103"
	)
	public static SpritePixels[] method6443(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return ItemComposition.method3087(var0, var3, var4);
	}
}
