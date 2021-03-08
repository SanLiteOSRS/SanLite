/*
 * Copyright (c) 2020, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package net.runelite.injector.transformers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.injector.injection.InjectData;
import net.runelite.asm.ClassFile;

/**
 * This class changes the java source file debug information to the rs-client file name
 */
@Slf4j
public class SourceChanger extends InjectTransformer
{
	private int n = 0;

	public SourceChanger(InjectData inject)
	{
		super(inject);
	}

	@Override
	void transformImpl()
	{
		inject.forEachPair(this::rename);
		log.info("[INFO] Changed source file debug information for {} classes", n);
	}

	private void rename(ClassFile rsClient, ClassFile vanilla)
	{
		++n;
		final String newSrc = rsClient.getSource();
		log.debug("[DEBUG] Changing src from {} to {}", vanilla.getSource(), newSrc);
		vanilla.setSource(newSrc);
	}
}
