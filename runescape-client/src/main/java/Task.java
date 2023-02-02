import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("Task")
public class Task {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("x")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1101971137
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("f")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("r")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
