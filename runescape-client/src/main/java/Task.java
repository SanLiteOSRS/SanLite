import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("Task")
public class Task {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("v")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 329615287
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("i")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("k")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
