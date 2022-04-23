import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -457481163
	)
	@Export("group")
	int group;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 327822779
	)
	@Export("type")
	int type;
	@ObfuscatedName("i")
	boolean field1028;

	InterfaceParent() {
		this.field1028 = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-886747176"
	)
	public static Object method2084(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}
}
