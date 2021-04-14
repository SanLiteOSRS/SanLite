import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1989294347
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 830473187
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 681655727
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1797150279
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1639037601
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -873076039
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 285476427
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1384507767
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 931208305
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2012617583
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -3097229
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("m")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("d")
	@Export("x")
	double x;
	@ObfuscatedName("c")
	@Export("y")
	double y;
	@ObfuscatedName("j")
	@Export("z")
	double z;
	@ObfuscatedName("r")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("q")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("t")
	@Export("speed")
	double speed;
	@ObfuscatedName("v")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 688098207
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 257882257
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lkw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1593867047
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1599773741
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = Varps.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class225.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "549276456"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Varps.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "622513403"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1389566626"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "23539817"
	)
	static final void method1981(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class69.addGameMessage(30, "", var1);
	}
}
